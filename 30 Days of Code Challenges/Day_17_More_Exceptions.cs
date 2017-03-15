class Calculator {
    
    public int power(int x, int y) {
        if(x < 0 || y < 0) {
            throw new System.ArgumentException("n and p should be non-negative");
        }
        
        return ((int)Math.Pow(x, y));
    }
}

