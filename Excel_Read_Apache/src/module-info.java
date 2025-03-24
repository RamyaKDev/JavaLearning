/**
 * 
 */
/**
 * 
 */
module POIExample {
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;
    requires org.apache.commons.collections4;
    requires org.apache.commons.compress;
    requires org.apache.commons.lang3;
    requires org.apache.poi.ooxml.schemas;
    requires org.apache.xmlbeans;
    requires java.base;
    requires java.desktop;

    exports poi;
}