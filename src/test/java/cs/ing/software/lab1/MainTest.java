package cs.ing.software.lab1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test()
    public void Test01(){
        Automovil nissan = new Automovil(10,100,0.9);
        Assert.assertEquals(nissan.recorrido(4), "Automovil viajo 4.0 y aun tiene 6.40 de combustible");
    }

    @Test()
    public void Test02(){
        Automovil nissan = new Automovil(10,100,0.9);
        Assert.assertEquals(nissan.recorrido(12), "Automovil necesita reabastecimiento de combustible");
    }

    @Test()
    public void Test03(){
        Automovil nissan = new Automovil(10,100,0.9);
        Assert.assertEquals(nissan.abastecer(100), "Automovil no se puede reabastecer el tanque, esta lleno");
    }

    @Test()
    public void Test04(){
        Automovil nissan = new Automovil(10,100,0.9);
        Assert.assertEquals(nissan.abastecer(10), "La cantidad de combustible del automovil es: 20.00");
    }

    @Test()
    public void Test05(){
        Camion volvo = new Camion(10,100,1.6);
        Assert.assertEquals(volvo.recorrido(4), "Camion viajo 4.0 y aun tiene 3.60 de combustible");
    }

    @Test()
    public void Test06(){
        Camion volvo = new Camion(0,100,1.6);
        Assert.assertEquals(volvo.recorrido(4), "Camion necesita reabastecimiento de combustible");
    }

    @Test()
    public void Test07(){
        Camion volvo = new Camion(10,100,1.6);
        Assert.assertEquals(volvo.abastecer(100), "Camion no se puede reabastecer el tanque, esta lleno");
    }

    @Test(invocationCount = 1000, threadPoolSize = 80)
    public void Test08(){
        Camion volvo = new Camion(10,100,1.6);
        Assert.assertEquals(volvo.abastecer(40), "La cantidad de combustible del camion es: 48.00");
    }
}
