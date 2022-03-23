package clips;

import net.sf.clipsrules.jni.*;

public class ClipsJava {
    public static void main(String[] args) throws Exception {
        Environment env = new Environment();

        // env.eval("(reset)");

        try {
            env.load("C:/CLIPSJNI/clips/market/templates.clp");
            env.load("C:/CLIPSJNI/clips/market/facts.clp");
            env.load("C:/CLIPSJNI/clips/market/rules.clp");
        } catch (Exception e) {
        }

        env.eval("(reset)");
        env.eval("(facts)");
        env.run();

        /*
         * env.eval("(reset)");
         * env.eval("(assert (person tom))");
         * env.eval("(assert (sintom covid))");
         * env.eval("(assert (sign tured))");
         * env.eval("(facts)");
         * env.eval("(reset)");
         * env.
         * build("(deftemplate product (slot part-number) (slot name) (slot category) (slot price))"
         * );
         * env.
         * assertString("(product (name \"USBMen\") (category \"storage\" (part-number 1234) (price 199.99))"
         * );
         * env.eval("(reset)");
         * env.eval("(facts)");
         */

    }
}