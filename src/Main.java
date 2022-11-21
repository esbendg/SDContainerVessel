public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        ContainerV containerV = new ContainerV();
        containerV.vessel("dk", 5,15,10, 10);
        containerV.loadingCargo("container", 2);
        System.out.printf(containerV.getCargoType());
        System.out.println("Total cargo available:" +containerV.utilityLevelOfCapacity());
        containerV.loadingCargo("container", 5);
        System.out.println("Total cargo available:" +containerV.utilityLevelOfCapacity());
        containerV.loadingCargo("container", 3);
        System.out.println("Total cargo available:" +containerV.utilityLevelOfCapacity());
        containerV.loadingCargo("vehicle",3 );
        System.out.println("Total cargo available:" +containerV.utilityLevelOfCapacity());
        containerV.loadingCargo("container",3);

    }
}