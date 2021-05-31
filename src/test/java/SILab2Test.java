import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



public class SILab2Test {
    private final SILab2 lbr = new SILab2();
    private List<Time> List = new ArrayList<>();
    private List<Integer> res = new ArrayList<>();

    @Test
    public void MultipleCondition() {
        List<Time> lista1 = new ArrayList<>();
        lista1.add(new Time(-1,30,30));
        List<Time> lista2 = new ArrayList<>();
        lista2.add(new Time(25,30,30));
        List<Time> lista3 = new ArrayList<>();
        lista3.add(new Time(12,30,30));
        List<Time> lista4 = new ArrayList<>();
        lista4.add(new Time(12,-1,30));
        List<Time> lista5 = new ArrayList<>();
        lista5.add(new Time(12,61,30));
        List<Time> lista6 = new ArrayList<>();
        lista6.add(new Time(12,30,-1));
        List<Time> lista7 = new ArrayList<>();
        lista7.add(new Time(12,30,61));
        List<Time> lista8 = new ArrayList<>();
        lista8.add(new Time(24,0,0));
        List<Time> lista9 = new ArrayList<>();
        lista9.add(new Time(24,0,1));
        List<Time> lista10 = new ArrayList<>();
        lista10.add(new Time(24,1,1));

        RuntimeException exception = null;

        try{
            lbr.function(lista1);
        }
        catch (RuntimeException ex){
            exception=ex;
        }
        assertEquals("The hours are smaller than the minimum", exception.getMessage());

        try{
            lbr.function(lista2);
        }
        catch (RuntimeException ex){
            exception=ex;
        }
        assertEquals("The hours are greater than the maximum", exception.getMessage());

        res.add(14706);
        assertEquals(res, lbr.function(lista3));

        try{
            lbr.function(lista4);
        }
        catch (RuntimeException ex){
            exception =ex;
        }
        assertEquals("The minutes are not valid", exception.getMessage());

        try{
            lbr.function(lista5);
        }
        catch (RuntimeException ex){
            exception =ex;
        }
        assertEquals("The minutes are not valid", exception.getMessage());

        try{
            lbr.function(lista6);
        }
        catch (RuntimeException ex){
            exception =ex;
        }
        assertEquals("The seconds are not valid", exception.getMessage());

        try{
            lbr.function(lista7);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertEquals("The seconds are not valid", exception.getMessage());

        res.remove(0);
        res.add(86400);
        assertEquals(res, lbr.function(lista8));

        try{
            lbr.function(lista9);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertEquals("The time is greater than the maximum", exception.getMessage());

        try{
            lbr.function(lista10);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertEquals("The time is greater than the maximum", exception.getMessage());
    }

    @Test
    public void EveryBranch() {
        List<Time> lista1 = new ArrayList<>();
        List<Time> lista2 = new ArrayList<>();
        lista2.add(new Time(-1,45,45));
        List<Time> lista3 = new ArrayList<>();
        lista3.add(new Time(25,45,45));
        List<Time> lista4 = new ArrayList<>();
        lista4.add(new Time(22,-2,2));
        List<Time> lista5 = new ArrayList<>();
        lista5.add(new Time(22,2,-2));
        List<Time> lista6 = new ArrayList<>();
        lista6.add(new Time(22,2,2));
        List<Time> lista7 = new ArrayList<>();
        lista7.add(new Time(24,0,0));
        List<Time> lista8 = new ArrayList<>();
        lista8.add(new Time(24,2,2));


        res = lbr.function(lista1);
        assertTrue(res.isEmpty());

        RuntimeException exception = null;

        try{
            lbr.function(lista2);
        }
        catch (RuntimeException ex){
            exception =ex;
        }
        assertEquals("The hours are smaller than the minimum", exception.getMessage());

        try{
            lbr.function(lista3);
        }
        catch (RuntimeException ex){
            exception =ex;
        }
        assertEquals("The hours are greater than the maximum", exception.getMessage());

        try{
            lbr.function(lista4);
        }
        catch (RuntimeException ex){
            exception =ex;
        }
        assertEquals("The minutes are not valid", exception.getMessage());

        try{
            lbr.function(lista5);
        }
        catch (RuntimeException ex){
            exception =ex;
        }
        assertEquals("The seconds are not valid", exception.getMessage());

        res.add(79322);
        assertEquals(res, lbr.function(lista6));

        res.remove(0);
        res.add(86400);
        assertEquals(res, lbr.function(lista7));

        try{
            lbr.function(lista8);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertEquals("The time is greater than the maximum", exception.getMessage());
    }

}