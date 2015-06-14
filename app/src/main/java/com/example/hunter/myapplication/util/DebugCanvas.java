package com.example.hunter.myapplication.util;

/**
 * Created by hunter on 13.06.15.
 */
import com.example.hunter.myapplication.util.*;

public interface DebugCanvas {
    public  void println(String string);
    public  void drawPoint(Point point, int color);
    public  void drawCross(Point point, int color);
    public  void drawPoints(Point[] points, int color);
    public  void drawLine(Line line, int color);
    public  void drawLines(Line[] lines, int color);
    public  void drawPolygon(Point[] points, int color);
    public  void drawMatrix(boolean[][] matrix);
}