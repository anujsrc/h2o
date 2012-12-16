import os, json, unittest, time, shutil, sys
sys.path.extend(['.','..','py'])

import h2o


def quick_startup(num_babies=3, sigar=False):
    babies = []
    try:
        for i in xrange(num_babies):
            # ports_per_node now 2
            babies.append(h2o.LocalH2O(port=54321+2*i, sigar=sigar))
        n = h2o.ExternalH2O(port=54321)
        h2o.stabilize_cloud(n, num_babies)
    except Exception, e:
        print e
        err = 'Error starting %d nodes quickly (sigar is %s)' % (num_babies,'enabled' if sigar else 'disabled')
        raise Exception(err)
    finally:
        # EAT THE BABIES!
        for b in babies: b.terminate()

class StartUp(unittest.TestCase):
    # nosetests doesn't do the h2o.unit_main, so have to cleanup here
    # normally build_cloud does it
    @classmethod
    def setUpClass(cls):
        h2o.clean_sandbox()

    def test_concurrent_startup(self):
        quick_startup(num_babies=3)

    # NOTE: we do not need to access Sigar API, since launched nodes
    # start sending heartbeat packets which contain information taken 
    # from Sigar
    def test_concurrent_startup_with_sigar(self):
       quick_startup(num_babies=3,sigar=True)

if __name__ == '__main__':
    h2o.unit_main()
