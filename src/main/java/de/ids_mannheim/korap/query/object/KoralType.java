package de.ids_mannheim.korap.query.object;

/**
 * Definition of various types of KoralQuery building objects.
 * 
 * @author margaretha
 * 
 */
public enum KoralType {
    TERMGROUP("koral:termGroup"), TERM("koral:term"), TOKEN("koral:token"), 
    SPAN("koral:span"), GROUP("koral:group"), BOUNDARY("koral:boundary"), 
    RELATION("koral:relation"), DISTANCE("koral:distance"), REFERENCE(
    "koral:reference"), DOCUMENT("koral:doc"), DOCUMENTGROUP("koral:docGroup"),
    COSMAS_DISTANCE("cosmas:distance");

    String value;


    KoralType (String value) {
        this.value = value;
    }


    @Override
    public String toString () {
        return value;
    }
}
