import dev.rickelmedias.patterns.facade.Facade;
import dev.rickelmedias.patterns.singleton.SingletonLazy;
import dev.rickelmedias.patterns.strategy.*;

public class Main {
    public static void main(String[] args) {
        // Test Singleton (Design Patter)
        // Same ID: @2c8d66b2S
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        // Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();

        // Facede
        Facade fac = new Facade();
        fac.migrarCLiente("Nome", "cep");
    }
}
