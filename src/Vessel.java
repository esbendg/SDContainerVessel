public abstract class Vessel {
    String flagNation; //The vessels flag Nation
    int draft; // draft of the vessel
    int length; //length of the vessel
    int width; //width of the vessel
    String cargoType; //the type of cargo the vessel can hold
    int maxCargo; //the amount of cargo the vessel can hold
    int currentCargo; //the current amount of cargo the vessel holds

    /*
    Constructor for instantiating a vessel object
     */
     public void vessel (String fn, int d, int l, int w, int mc){
         this.flagNation = fn;
         this.draft = d;
         this.length = l;
         this.width = w;
         this.maxCargo= mc;
     }
     /*
     Method for loading cargo. Checks if the cargo type matches the allowed cargo in the vessel,
     then if the current amount of cargo + the added amount exceeds the maxCargo space.
     Returns true if space is available and then sets new currentCargo
     Returns false if either the cargo is full or wrong type
      */
     public boolean loadingCargo(String ct, int ca){

         if (ct.equals(this.cargoType)){
             if (ca + this.currentCargo <= this.getMaxCargo()){
                 setCurrentCargo(ca);
                 return true;
             }
             System.out.println("Not enough room in cargo");
             return false;
         }
         System.out.println("Incorrect Cargo Type");
         return false;
     }
     /*
     A return method for checking the utility level of capacity.
      */
    public int utilityLevelOfCapacity(){
         if (this.currentCargo == this.maxCargo){

             System.out.println("Level of capacity used is " + this.currentCargo*100/this.getMaxCargo() + " %");
             return 0;

         } else
             System.out.println("Level of capacity used is " + this.currentCargo*100/this.getMaxCargo() + " %");
       return this.getMaxCargo()-this.currentCargo;
    }
    /*
    Set current cargo to a specific level by adding cargo
     */
    public void setCurrentCargo(int currentCargo) {
        this.currentCargo = this.currentCargo + currentCargo;
    }
    /*
    Returns the current amount of cargo
     */
    public int getCurrentCargo() {
        return currentCargo;
    }
    /*
    Returns max cargo capacity
     */
    public int getMaxCargo() {
        return maxCargo;
    }
    /*
       Returns the type of cargo that the vessel can hold
        */
    public String getCargoType() {
        return cargoType;
    }
    /*
    *Unused
    returns the draft
     */
    public int getDraft() {
        return draft;
    }
    /*
       *Unused
       returns the length
        */
    public int getLength() {
        return length;
    }
    /*
       *Unused
       returns the width
        */
    public int getWidth() {
        return width;
    }
    /*
       *Unused
       returns the flag nation of the vessel
        */
    public String getFlagNation() {
        return flagNation;
    }
}
