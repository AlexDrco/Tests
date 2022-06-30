package DesignPatterns;

import DesignPatterns.memento.Editor;
import DesignPatterns.memento.History;
import DesignPatterns.state.BrushTool;
import DesignPatterns.state.Canvas;
import DesignPatterns.state.EraserTool;
import DesignPatterns.state.SelectionTool;

public class Main {

    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }

}
