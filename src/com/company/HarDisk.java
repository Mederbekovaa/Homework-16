package com.company;

public class HarDisk {
    private int size;
    private int partial;

    public HarDisk (int size, int partial) {
        this.size = size;
        this.partial = partial;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPartial() {
        return partial;
    }

    public void setPartial(int partial) {
        this.partial = partial;
    }
}
