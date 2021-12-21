
public class a {

    public static void main(String[] args) {
    	
    	int uno=1, dos=2;
    	if (uno == 1 | ++dos == 18) {
    		System.out.println("| :" + dos);
	    	}
	    	if (uno == 1 || ++dos == 4) {
	    		System.out.println("|| :" + dos);
	    	}
    	if (uno != 1 & ++dos == 4) {
    		System.out.println("& :" + dos);
	    	}
	    	else {
	    		System.out.println("¬ no se cumple pero dos vale :" + dos);
	    	}
    	if (uno != 1 && dos == 5) {
    		System.out.println("&& :" + dos);
    	}
    	System.out.println("Valor final: " + dos);
    }
}	