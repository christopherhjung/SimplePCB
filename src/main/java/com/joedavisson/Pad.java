package com.joedavisson;

public class Pad
{
    double x;
    double y;
    double innerSize;
    double outerSize;
    boolean status = false;
    int layer;
    int group = -1;
    boolean selected = false;
    int id = 0;

    Pad(int temp_layer, double temp_x, double temp_y,
        double temp_innerSize, double temp_outerSize)
    {
        layer = temp_layer;
        x = temp_x;
        y = temp_y;
        innerSize = temp_innerSize;
        outerSize = temp_outerSize;
        status = false;
        group = -1;
    }

    public void copy(Pad pad)
    {
        layer = pad.layer;
        x = pad.x;
        y = pad.y;
        innerSize = pad.innerSize;
        outerSize = pad.outerSize;
        status = pad.status;
        group = -1;
    }

    public boolean inbox(double x1, double y1, double x2, double y2)
    {
        return (x - outerSize / 2) > x1 && (x + outerSize / 2) < x2
                && (y - outerSize / 2) > y1 && (y + outerSize / 2) < y2;
    }
}

