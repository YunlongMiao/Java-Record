class Tax extends K {
    double s, k, p;
    public Tax() {
    }

    Tax(double s, double k, double p) {
        this.s = s;
        this.k = k;
        this.p = p;
    }

    public double count() {
        return (s + (k - 2.5) * p);
    }
}
