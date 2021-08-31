public class CountNames {
	public static void main( String args[] ) {
        
        String[] names = {"Tommy Lee Jones", "William Hurt", "Nicole Kidman",
            "Catherine Zeta-Jones", "JAMES EARL JONES", "Tom Hardy", 
            "Judi Dench", "Sean Bean", "Carey Mulligan", "Toby Jones" };
        
        int total = 0;
        for(String name : names) {
            if(name.toUpperCase().endsWith("JONES")) {
                total++;
            }
        }
        System.out.println(total);
	}
}

