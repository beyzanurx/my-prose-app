package de.htw_berlin.fb4.ossd;

import de.htw_berlin.fb4.ossd.prose.Prose;
import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

public class App
{
    public static void main( String[] args )
    {
        ProseBuilder builder = new ProseBuilder();
        builder.register(new FoodSentence());
        builder.register(new RealitySentence());
        String result = builder.get();

        System.out.println(result);
    }
}
