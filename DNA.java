public class DNA {
    public static void main(String[] args){

        
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        
        String dnas[] = {dna1, dna2, dna3};

        
        
       for(String dna : dnas ){
           
         
         int indexATG = dna.indexOf("ATG");
         int indexTGA = dna.indexOf("TGA");
 
 
         

        
         if(indexATG >= 0 && indexTGA >= 0 && (indexATG - indexTGA) % 3 == 0 ){
           
           String protein = dna.substring(indexATG, indexTGA + 3);
           System.out.println("DNA: " + dna);
           System.out.println("Proteína: " + protein);
             
         } else {
             
            System.out.println("DNA: " + dna);
            System.out.println("não tem proteína.");
             
         }
       }
    }
}