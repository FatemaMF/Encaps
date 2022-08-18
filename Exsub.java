import Subpack.*;

public class Exsub
{
public static void main (String[] args)
{
	Human h= new Human();
	h.setHight(1.34f);
	h.setWeight(100);
	h.setBnt(calc(h));
	
	System.out.println("Person has " + h.getWeight() + " " +h.getHight() +" "+h.getBnt());


}


public static float calc(Human h)
{

return h.getWeight()/(h.getHight()*h.getBnt());
}
}
