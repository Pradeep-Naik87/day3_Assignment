package instanceofoperator;

public class Citizen {
static void selectState(India obj)
{
	 if(obj instanceof Karnataka)
	 {
		 Karnataka k=(Karnataka) obj;
		 System.out.println("PM: "+k.pm+" CM: "+k.cm);
	 }
	 else if(obj instanceof Maharashtra)
	 {
		 Maharashtra m=(Maharashtra) obj;
		 System.out.println("PM: "+m.pm+" CM: "+m.cm);
	 }
	 else 
	 {
		 TamilNadu t=(TamilNadu) obj;
		 System.out.println("PM: "+t.pm+" CM: "+t.cm);
	 }
}
}
