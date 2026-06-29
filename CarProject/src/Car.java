public class Car {

    //car variables
    private boolean started;

    private int gear;

    private int speed;

    //Métodos
    public void startCar() {
        started = true;
    }

    public void turnOffCar() {
        started = false;
    }

    public void increaceGear() {
        if (getSpeed() == 20 ||getSpeed() == 40 ||getSpeed() == 60 ||getSpeed() == 80) {
            gear++;
        } else if (getSpeed() > 100){
            System.out.println("Marcha máxima alcançada!");
        } else {
            System.out.println("Chegue na velocidade limite da marcha atual para passar de marcha");
        }

    }

    public void decraceGear() {
        if (getSpeed() == 1 || getSpeed() == 21 ||getSpeed() == 60 ||getSpeed() == 80 ||getSpeed() == 100) {
            gear--;
        } else if (getSpeed() < 20){
            System.out.println("Marcha máxima alcançada!");
        } else {
            System.out.println("Chegue na velocidade limite da marcha atual para passar de marcha");
        }
    }

    public void accelerate() {
        if (started) {
            if (gear == 1) {
                if (speed < 20) {
                    speed++;
                } else {
                    System.out.println("Limite da 1ª marcha atingido! Engate a 2ª para acelerar.");
                }
            } else if (gear == 2) {
                if (speed < 40) {
                    speed++;
                } else {
                    System.out.println("Limite da 2ª marcha atingido! Engate a 3ª para acelerar.");
                }
            } else if (gear == 3) {
                if (speed < 60) {
                    speed++;
                } else {
                    System.out.println("Limite da 3ª marcha atingido! Engate a 4ª para acelerar.");
                }
            } else if (gear == 4) {
                if (speed < 80) {
                    speed++;
                } else {
                    System.out.println("Limite da 4ª marcha atingido! Engate a 5ª para acelerar.");
                }
            } else if (gear == 5) {
                if (speed < 100) {
                    speed++;
                } else {
                    System.out.println("Limite da 5ª marcha atingido! Engate a 6ª para acelerar.");
                }
            } else if (gear == 6) {
                if (speed < 120) {
                    speed++;
                } else {
                    System.out.println("Limite do carro atingido!.");
                }
            } else {
                System.out.println("Neutro engatado! Engate a 1ª para acelerar");
            }

        } else {
            System.out.println("Ligue o carro para acelerar!");
        }

    }

    public void slowDownCar() {
        if (started) {
            if (gear == 6) {
                if (speed > 100) {
                    speed--;
                } else {
                    System.out.println("Limite da 6ª marcha atingido! Engate a 5ª para desacelerar.");
                }
            } else if (gear == 5) {
                if (speed > 80) {
                    speed--;
                } else {
                    System.out.println("Limite da 5ª marcha atingido! Engate a 4ª para desacelerar.");
                }
            } else if (gear == 4) {
                if (speed > 60) {
                    speed--;
                } else {
                    System.out.println("Limite da 4ª marcha atingido! Engate a 3ª para desacelerar.");
                }
            } else if (gear == 3) {
                if (speed > 40) {
                    speed--;
                } else {
                    System.out.println("Limite da 3ª marcha atingido! Engate a 2ª para desacelerar.");
                }
            } else if (gear == 2) {
                if (speed > 20) {
                    speed--;
                } else {
                    System.out.println("Limite da 2ª marcha atingido! Engate a 1ª para desacelerar.");
                }
            } else if (gear == 1) {
                if (speed > 0) {
                    speed--;
                } else {
                    System.out.println("Carro está parado!.");
                }
            } else {
                System.out.println("Neutro engatado!");
            }
        }
    }

    //Getters and Setters


    public boolean getStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //builder
    public Car(){
        started = false;
        gear = 0;
        speed = 0;
    }
}
