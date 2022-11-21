import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
    /*
    Testing methods in Vessel, through the ContainerV subclass
     */
public class VesselTest {
    /*
    Testing loadingCargo and utilityLevelOfCapacity with a for loop.
    First constructing a containerV vessel, with parameters. Then creating a for loop that loads cargo at intervals of 5.
    Then testing to see if utilityLevelOfCapacity is equal to maxCargo - currentCargo.
    After the loop we add the remaining amount of cargo for a full capacity.
     */
    @Test
    void containerTestLoading(){
        ContainerV containerV = new ContainerV();
        containerV.vessel("DK", 10, 25, 15, 200);
        for (int i=0; i<100; i=i+5){
            containerV.loadingCargo("container", i);
            assertEquals(containerV.utilityLevelOfCapacity(), containerV.getMaxCargo()- containerV.currentCargo);
        }
        containerV.loadingCargo("container", containerV.getMaxCargo()- containerV.getCurrentCargo());
        System.out.println(containerV.utilityLevelOfCapacity());
    }
    /*
    Testing to see if Cargo of the wrong type can be loaded.
     */
    @Test
    void containerTestWrongCT(){ //Testing getFlagnation
        ContainerV containerV = new ContainerV();
        containerV.vessel("DK", 10, 25, 15, 200);
        containerV.loadingCargo("liquid", 50);
        assertEquals(containerV.utilityLevelOfCapacity(),200 );
    }
    @Test
    void containerTestMC(){ //Testing getMaxCargo
        ContainerV containerV = new ContainerV();
        containerV.vessel("DK", 10, 25, 15, 200);
        assertEquals(containerV.getMaxCargo(),200);
    }
    @Test
    void containerTestCT() { //Testing getCargoType
        ContainerV containerV = new ContainerV();
        containerV.vessel("DK", 10, 25, 15, 200);
        assertEquals(containerV.getCargoType(), "container");
    }
    @Test
    void containerTestGD(){ //Testing getDraft
        ContainerV containerV = new ContainerV();
        containerV.vessel("DK", 10, 25, 15, 200);
        assertEquals(containerV.getDraft(),10 );
    }
    @Test
    void containerTestGL(){ //Testing getLength
        ContainerV containerV = new ContainerV();
        containerV.vessel("DK", 10, 25, 15, 200);
        assertEquals(containerV.getLength(),25 );
    }
    @Test
    void containerTestGW(){  //Testing getWidth
        ContainerV containerV = new ContainerV();
        containerV.vessel("DK", 10, 25, 15, 200);
        assertEquals(containerV.getWidth(),15 );
    }
    @Test
    void containerTestGF(){ //Testing getFlagnation
        ContainerV containerV = new ContainerV();
        containerV.vessel("DK", 10, 25, 15, 200);
        assertEquals(containerV.getFlagNation(),"DK" );
    }
}
