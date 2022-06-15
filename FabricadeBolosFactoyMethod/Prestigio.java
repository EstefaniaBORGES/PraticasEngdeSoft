package fabricadebolos;

public class Prestigio extends Bolo{

    public Prestigio() {
        setNome("Prestigio");
        setPreco(150.00f);
        setTipo("55 ovos");
    }    

    @Override
    public void receita() {
        System.out.println("50kg de coco, 2kg leite ninho, 55 ovos,5kg farinha, leite de coco");
    }    
}