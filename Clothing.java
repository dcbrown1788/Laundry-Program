
public class Clothing{
   private String name;
   private double wears;
   private double maxWears;
   private double volume;
   private double wearsTotal;
   
   
   public Clothing(String name, double wears,double maxWears, double volume, double wearsTotal){
     this.name = name;
     this.wears = wears;
     this.maxWears = maxWears;
     this.volume = volume;
     this.wearsTotal = wearsTotal;
   }
   
   public String getName(){
     return name;
   }
   
   public double getWears(){
     return wears;
   }
   
   public double getMaxWears(){
     return maxWears;
   }
   
   public double getVolume(){
     return volume;
   }
   
   public double getWearsTotal(){
     return wearsTotal;
   }
   
   public void setName(String input){
     name = input;
     
   }
   
   public void setWears(double input){
     wears = input;
   }
   
   public void setMaxWears(double input){
     maxWears = input;
   }
   
   public void setVolume(double input){
     volume = input;
   }
   
     public void setWearsTotal(int input){
     wearsTotal = input;
   }
   
   
}