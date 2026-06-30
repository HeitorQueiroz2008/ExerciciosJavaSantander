public class Car {

    //car variables
    private boolean started;

    private int gear;

    private int speed;

    //Métodos


    public void turnOnOffCar() {
        if (getStarted()) {
            if (getSpeed() == 0) {
                setStarted(false);
                System.out.println("Você desligou o carro!");
            } else {
                System.out.println("Pare o carro para desligá-lo");
            }
        } else {
            setStarted(true);
            System.out.println("Você ligou o carro!");

        }
    }

    public void increaceGear() {
        if (!getStarted()) {
            System.out.println("Ligue o carro para continuar!");
        } else if ((getSpeed() == 0 && getGear() == 0) || (getSpeed() == 20 && getGear() == 1) || (getSpeed() == 40 && getGear() == 2) || (getSpeed() == 60 && getGear() == 3) || (getSpeed() == 80 && getGear() == 4) || (getSpeed() == 100 && getGear() == 5)) {
            gear++;
            System.out.printf("Marcha passada! Sua marcha atual: %sª\n", getGear());
        } else if (getGear() == 6) {
            System.out.println("Marcha máxima alcançada!");
        } else {
            System.out.printf("Chegue na velocidade limite da marcha atual para passar de marcha! Velocidade atual: %s km/h\n", getSpeed());
        }

    }

    public void decraceGear() {
        if (!getStarted()) {
            System.out.println("Ligue o carro para continuar!");
        } else if ((getSpeed() == 1  && getGear() == 1) || (getSpeed() == 20 && getGear() == 2) || (getSpeed() == 40  && getGear() == 3) || (getSpeed() == 60  && getGear() == 4) || (getSpeed() == 80  && getGear() == 5) || (getSpeed() == 100  && getGear() == 5)) {
            gear--;
            System.out.printf("Marcha passada! Sua marcha atual: %sª\n", getGear());
        } else if (getGear() == 0) {
            System.out.println("Marcha mínima alcançada!");
        } else {
            System.out.printf("Chegue na velocidade mínima da marcha atual para diminuir marcha! Velocidade atual: %s km/h", getSpeed());
        }
    }

    public void accelerate() {
        if (!getStarted()) {
            System.out.println("Ligue o carro para continuar!");
        } else if (gear == 1) {
            if (speed < 20) {
                speed++;
                System.out.printf("Acelerando... Velocidade atual: %s km/h", getSpeed());
            } else {
                System.out.println("Limite da 1ª marcha atingido! Engate a 2ª para acelerar.");
            }
        } else if (gear == 2) {
            if (speed < 40) {
                speed++;
                System.out.printf("Acelerando... Velocidade atual: %s km/h", getSpeed());
            } else {
                System.out.println("Limite da 2ª marcha atingido! Engate a 3ª para acelerar.");
            }
        } else if (gear == 3) {
            if (speed < 60) {
                speed++;
                System.out.printf("Acelerando... Velocidade atual: %s km/h", getSpeed());
            } else {
                System.out.println("Limite da 3ª marcha atingido! Engate a 4ª para acelerar.");
            }
        } else if (gear == 4) {
            if (speed < 80) {
                speed++;
                System.out.printf("Acelerando... Velocidade atual: %s km/h", getSpeed());
            } else {
                System.out.println("Limite da 4ª marcha atingido! Engate a 5ª para acelerar.");
            }
        } else if (gear == 5) {
            if (speed < 100) {
                speed++;
                System.out.printf("Acelerando... Velocidade atual: %s km/h", getSpeed());
            } else {
                System.out.println("Limite da 5ª marcha atingido! Engate a 6ª para acelerar.");
            }
        } else if (gear == 6) {
            if (speed < 120) {
                speed++;
                System.out.printf("Acelerando... Velocidade atual: %s km/h", getSpeed());
            } else {
                System.out.println("Limite do carro atingido!.");
            }
        } else {
            System.out.println("Neutro engatado! Engate a 1ª para acelerar");
        }

    }


    public void slowDownCar() {
        if (!getStarted()) {
            System.out.println("Ligue o carro para continuar!");
        } else if (gear == 6) {
            if (speed > 100) {
                speed--;
                System.out.printf("Desacelerando... Velocidade atual: %s km/h", getSpeed());
            } else {
                System.out.println("Limite da 6ª marcha atingido! Engate a 5ª para desacelerar.");
            }
        } else if (gear == 5) {
            if (speed > 80) {
                speed--;
                System.out.printf("Desacelerando... Velocidade atual: %s km/h", getSpeed());
            } else {
                System.out.println("Limite da 5ª marcha atingido! Engate a 4ª para desacelerar.");
            }
        } else if (gear == 4) {
            if (speed > 60) {
                speed--;
                System.out.printf("Desacelerando... Velocidade atual: %s km/h", getSpeed());
            } else {
                System.out.println("Limite da 4ª marcha atingido! Engate a 3ª para desacelerar.");
            }
        } else if (gear == 3) {
            if (speed > 40) {
                speed--;
                System.out.printf("Desacelerando... Velocidade atual: %s km/h", getSpeed());
            } else {
                System.out.println("Limite da 3ª marcha atingido! Engate a 2ª para desacelerar.");
            }
        } else if (gear == 2) {
            if (speed > 20) {
                speed--;
                System.out.printf("Desacelerando... Velocidade atual: %s km/h", getSpeed());
            } else {
                System.out.println("Limite da 2ª marcha atingido! Engate a 1ª para desacelerar.");
            }
        } else if (gear == 1) {
            if (speed > 0) {
                speed--;
                System.out.printf("Desacelerando... Velocidade atual: %s km/h", getSpeed());
            } else {
                System.out.println("Carro está parado!.");
            }
        } else {
            System.out.println("Neutro engatado!");
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

    public int getSpeed() {
        return speed;
    }

    //builder
    public Car() {
        started = false;
        gear = 0;
        speed = 0;
    }
}
