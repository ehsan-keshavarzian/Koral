package de.ids_mannheim.korap.query.serialize;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author hanl
 * @date 07/02/2014
 */
public class MetaQueryBuilder {

    private Map meta;

    public MetaQueryBuilder() {
        this.meta = new LinkedHashMap();
    }

    /**
     * context segment if context is either of type char or token.
     * size can differ for left and right span
     * @param left
     * @param leftType
     * @param right
     * @param rightType
     * @return
     */
    public MetaQueryBuilder addContext(Integer left, String leftType,
                                       Integer right, String rightType) {
        Map map = new LinkedHashMap();
        List l = new LinkedList();
        List r = new LinkedList();
        l.add(leftType);
        l.add(left);
        map.put("left", l);
        r.add(rightType);
        r.add(right);
        map.put("right", r);
        meta.put("context", map);
        return this;
    }

    /**
     * context if of type paragraph or sentence where left and right size delimiters are irrelevant.
     * @param type
     * @return
     */
    public MetaQueryBuilder addContext(String type) {
        addEntry("context", type);
        return this;
    }


    public MetaQueryBuilder addEntry(String name, Object value) {
        meta.put(name, value);
        return this;
    }

    public Map raw() {
        return meta;
    }
}
