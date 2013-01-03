package water.parser;

import water.*;
import water.parser.DParseTask.Pass;

public class ParseStatus extends Iced {
  public DParseTask.Pass _phase;
  public long _sofar;
  public long _total;

  public ParseStatus() { }
  public ParseStatus(long total) {
    _phase = Pass.ONE;
    _sofar = 0;
    _total = total;
  }

  public static void update(Key statusKey, final long steps, final Pass phase) {
    new TAtomic<ParseStatus>() {
      @Override
      public ParseStatus atomic(ParseStatus old) {
        if( old._phase == phase) {
          old._sofar += steps;
        } else if( old._phase.ordinal() < phase.ordinal() ) {
          old._phase = phase;
          old._sofar = steps;
        } else {
          return null; // we are passed this phase already
        }
        return old;
      }
      @Override public ParseStatus alloc() { return new ParseStatus(); }
    }.invoke(statusKey);
  }
}