package lt.inventi.playground;

import org.apache.camel.builder.*;
import java.util.Random;

/**
 * Task #2. Pagal Timer'į generuojamas atsitiktinis skaičius (bent 3 variantus, pvz. daugiau už X, daugiau už Y, kitaip)
 * ir priklausomai nuo jo reikšmės, veiksmas perduodamas į kitus "route'us" (direct).
 * Juose išvedamas kažkoks (kiekvienam atvejui skirtingas) tekstas į konsolę bei pati atsitiktinio skaičiaus reikšmė.
 * Iš Java kodo gali būti išvedamas tik tekstas bei skaičius,
 * o sąlyga turėtų būti tikrinama su Camel DSL direktyvomis (reikia susirasti, kokiomis). - Camel choice when
 */
public class PlaygroundRouteBuilder extends RouteBuilder {

    public static final int X = 27; // should be less than Y
    public static final int Y = 77;

    public void configure() throws Exception {
        from("timer://timer?period=2000")
            .setBody(simple("150"))
            .beanRef("randomGenerator")
            .choice()
                .when(simple("${body} < " + X))
                    .to("direct:a")
                .when(simple("${body} < " + Y))
                    .to("direct:b")
                .otherwise()
                    .to("direct:c")
            .endChoice()
        ;

        from("direct:a")
            .to("bean:output?method=lessThanX")
        ;
        from("direct:b")
            .to("bean:output?method=lessThanY")
        ;
        from("direct:c")
            .to("bean:output?method=moreThanXY")
        ;
    }
}

