package tss;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.GeneralPath;


public class ShapeFactoryTest {

    @Test
    void testCreateTriangle() {
        ShapeFactory factory = new ShapeFactory(71);
        Assertions.assertNotNull(factory.shape, "Shape should not be null");
        Assertions.assertTrue(factory.shape instanceof GeneralPath, "Shape should be a triangle (GeneralPath)");
    }

    @Test
    void testCreateRectangle() {
        ShapeFactory factory = new ShapeFactory(51);
        Assertions.assertNotNull(factory.shape, "Shape should not be null");
        Assertions.assertTrue(factory.shape instanceof Rectangle2D.Double, "Shape should be a rectangle");
    }

    @Test
    void testUnsupportedTypeThrowsError() {
        Error exception = Assertions.assertThrows(Error.class, () -> new ShapeFactory(22));
        Assertions.assertEquals("type is nusupported", exception.getMessage());
    }

    @Test
    void testStrokeWidth() {
        ShapeFactory factory1 = new ShapeFactory(14);
        Assertions.assertEquals(7.0f, factory1.stroke.getLineWidth(), "Stroke width should be 7.0");

        ShapeFactory factory2 = new ShapeFactory(11);
        Assertions.assertEquals(3.0f, factory2.stroke.getLineWidth(), "Stroke width should be 3.0");
    }

    @Test
    void testPaintColor() {
        ShapeFactory factory = new ShapeFactory(18);
        Assertions.assertEquals(Color.red, factory.paint, "Paint color should be red");
    }
}
