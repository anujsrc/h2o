import os, json, unittest, time, shutil, sys
sys.path.extend(['.','..','py'])

import h2o, h2o_cmd, h2o_glm


class Basic(unittest.TestCase):
    @classmethod
    def setUpClass(cls):
        # uses two much memory with 4?
        # FIX! does it die with 3?
        h2o.build_cloud(2)

    @classmethod
    def tearDownClass(cls):
        h2o.tear_down_cloud()

    def test_glm_covtype_single_cols(self):
        timeoutSecs = 10
        csvPathname = h2o.find_dataset('UCI/UCI-large/covtype/covtype.data')
        print "\n" + csvPathname

        # columns start at 0
        y = "54"
        x = ""
        parseKey = h2o_cmd.parseFile(csvPathname=csvPathname, timeoutSecs=15)

        print "GLM binomial wth 1 X column at a time" 
        print "Result check: abs. value of coefficient and intercept returned are bigger than zero"
        for colX in xrange(54):
            if x == "": 
                x = str(colX)
            else:
                # x = x + "," + str(colX)
                x = str(colX)

            sys.stdout.write('.')
            sys.stdout.flush() 
            print "\nx:", x
            print "y:", y

            start = time.time()
            kwargs = {'x': x, 'y': y, 'xval': 6, 'case': 2}
            glm = h2o_cmd.runGLMOnly(parseKey=parseKey, timeoutSecs=timeoutSecs, **kwargs)
            h2o_glm.simpleCheckGLM(self, glm, colX, **kwargs)
            print "glm end on ", csvPathname, 'took', time.time() - start, 'seconds'


if __name__ == '__main__':
    h2o.unit_main()
