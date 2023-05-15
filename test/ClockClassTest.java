import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockClassTest {

   ClockClass clock = new ClockClass();
   @Test
   public void setHourTest(){
     clock.setHour(5);
       assertEquals (5, clock.getHour());
    }
   @Test
   public void IncreaseClockToFiftyTwoTest(){
      clock.setHour(52);

    assertEquals( 0, clock.getHour());
   }


}
