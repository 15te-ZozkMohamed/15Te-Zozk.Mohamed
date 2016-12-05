import java.awt.*;

 //Krypteringsobjekt
 //Krypterar/dekrypterar enligt ADFGVX algoritmen

public class Krypto
{
    private String krypto = "yen29rx8htosk54m0juflz3adbvc6pgiqw17";//får att få tillgŒng till samma flera gånger  
    private final String code = "ADFGVX";
    
    public Krypto()
    {
        krypto = "abcdefghijklmnopqrstuvwxyz0123456789" ;
        
        //Scramble
        for (int i = 0; i < 100; i++)
        {
            swapInKrypto(randomPos(),randomPos());
        }
        
    }//Krypt
    
    public Krypto(int fusk) //ger samma krypto varje gång!
    {
    }//Krypto
    

	 //Kryptering enligt ADFGVX algoritmen
	
	 //Den string som skall krypteras
	 //Den krypterade stringen 
	
	public String encrypt(String s)
	{
		Point p;
		String res = ""; //Tomma stringen
		for (int i = 0; i < s.length(); i++)
		{
		    p = indexOf(s.charAt(i));
		    res = res + code.charAt(p.x) + code.charAt(p.y);
		}
		return res; 
	}
	

	 //Dekryptering enligt ADFGVX algoritmen
	
	 //@param  String s   Den string som skall dekrypteras
	 //@return String     Den dekrypterade stringen 

	public String decrypt(String s)
	{
		String res = ""; //Tomma stringen
		Point p;
		for (int i = 0; i < s.length(); i = i + 2)
		{
		    //ta fram paret som representerar ett tecken och deras index 0..5
		    p = new Point(code.indexOf(s.substring(i,i+1)),
		                  code.indexOf(s.substring(i+1,i+2)));
		    res = res + krypto.charAt(p.x*6+p.y);
		}
		return res;
	}

	//random point in [0..5,0..5]
	
	private int randomPos()
	{
		return (int) (Math.random()*(krypto.length()));
	}//rand
	
	//Det tecken som sšks i tabellen
	 //rad- och kolumnindex får givet tecken

	private Point indexOf(char c)
	{
        int index = krypto.indexOf(c);
        
        int i = index/6; // radindex
        int j = index%6; // kolindex
		
		return new Point(i,j);
	}//indexOf
	
    private void swapInKrypto(int p1, int p2)
    {
        if (p1 > p2)
        {
            int t = p1;
            p1 = p2;
            p2 = t;
        }
        if ( p1 != p2)
            krypto = krypto.substring(0,p1) + krypto.substring(p2,p2+1) + krypto.substring(p1+1,p2) + 
                   krypto.charAt(p1) + krypto.substring(p2+1,krypto.length());
    }//swap
    
    public void printKrypto()
    {
        System.out.println("Kryptot");
        for (int c = 0; c < code.length(); c++)
        {
           System.out.print("\t"+code.charAt(c));
        }
       System.out.println();
       
        for (int i = 0; i < code.length(); i++)
        {
           System.out.print(code.charAt(i)+"\t");
           for (int j = 0; j < 6; j++)
                System.out.print(krypto.charAt(i*6+j)+"\t");
           System.out.println();
        }
        
       System.out.println();

    }//printKrypto
	
}//Krypto