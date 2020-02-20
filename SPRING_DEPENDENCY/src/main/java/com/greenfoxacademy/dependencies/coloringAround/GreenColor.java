package com.greenfoxacademy.dependencies.coloringAround;

import com.greenfoxacademy.dependencies.HelloDI.Printer.Printer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green")
public class GreenColor implements MyColor {

    private Printer printer;

    @Override
    public void printColor() {
        printer.log("It is a green color");
    }
}
