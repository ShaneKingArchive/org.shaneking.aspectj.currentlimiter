package sktest.aspectj.currentlimiter.aspectj.prepare;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

@Slf4j
public class PrepareCurrentLimiterCallable implements Callable<Boolean> {

  @Override
  public Boolean call() {
    try {
      new PrepareCurrentLimiter().currentLimiter();
      return true;
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      return false;
    }
  }
}
