
package javaadvancedoct.Miercoles;


abstract class Bank {
    abstract float getRateOfInterest();
}

class SBI extends Bank{
    float getRateOfInterest(){return 7.3f;}
}

class PNB extends Bank{
    float getRateOfInterest(){return 8.15f;}
}

class ICICI extends Bank{
    float getRateOfInterest(){return 9.45f;}
}

class Test{
    public static void main(String[] args) {
        Bank b;
        String msg="", msg2="", msg3="";
    
        b= new SBI();
        msg+="Rate of interest is: ";
        msg+=+b.getRateOfInterest();
        msg+=" %";
        System.out.println(msg);
        
        b= new PNB();
        msg+="Rate of interest is: ";
        msg+=+b.getRateOfInterest();
        msg+=" %";
        System.out.println(msg);
                
        
    }    
}