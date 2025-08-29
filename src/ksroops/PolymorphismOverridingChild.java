package ksroops;

public class PolymorphismOverridingChild extends PolymorphismOverridingParent{
	
	@Override
	void sound() {
		System.out.println("Dog Braks");
	}


	public static void main(String[] args) {
		
		PolymorphismOverridingParent p=new PolymorphismOverridingParent();
		
	}

}
