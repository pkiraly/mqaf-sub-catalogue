# SUB catalogue metadata quality assurance

This project analizes metadata quality aspects of the catalogue of the Niedersächsische Staats- und Universitätsbibliothek Göttingen (SUB, www.sub.uni-goettingen.de/) as part of the [Metadata Quality Assurance Framework](http://pkiraly.github.io).

Usage:

Build the tool:

    mvn clean install

It creates `target/mqaf-sub-catalogue-1.0-SNAPSHOT-full.jar`.

Run:

    java -cp target/mqaf-sub-catalogue-1.0-SNAPSHOT-full.jar com.nsdr.pica.PicaplusToJson [Pica+ file] > [JSON file]

