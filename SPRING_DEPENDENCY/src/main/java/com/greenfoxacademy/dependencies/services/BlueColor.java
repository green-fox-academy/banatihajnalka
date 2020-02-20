package com.greenfoxacademy.dependencies.services;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("blue")
public class BlueColor implements MyColor {

    private Printer printer;

    @Override
    public void printColor() {
        printer.log("Is is a blue color");
    }
}
