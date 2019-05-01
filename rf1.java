import java.util.ArrayList;
import java.util.Scanner;

public class Parking {
    class Sedan {
        public String Type = "Sedan";
        public int width;   // 차량 너비
        public int height;  // 차량 길이
        public int carNum;  // 차량 번호
        public int price;  // 차량 가격
        public String owner; // 차량 소유자
        int time;     // 주차 시간

        public Sedan(int width, int height, int carNum, int price, String owner) {
            this.width = width;
            this.height = height;
            this.carNum = carNum;
            this.price = price;
            this.owner = owner;
        }

        public void clark() {
            System.out.println("bang bang~");
        }
    }

    class Truck {
        public String Type = "Truck";
        public int width;   // 차량 너비
        public int height;  // 차량 길이
        public int carNum;  // 차량 번호
        public int price;  // 차량 가격
        public String owner; // 차량 소유자
        int time;     // 주차 시간

        public Truck(int width, int height, int carNum, int price, String owner) {
            this.width = width;
            this.height = height;
            this.carNum = carNum;
            this.price = price;
            this.owner = owner;
        }

        public void clark() {
            System.out.println("bung~");
        }
    }

    class Jeep {
        public String Type = "Jeep";
        public int width;   // 차량 너비
        public int height;  // 차량 길이
        public int carNum;  // 차량 번호
        public int price;  // 차량 가격
        public String owner; // 차량 소유자
        int time;     // 주차 시간

        public Jeep(int width, int height, int carNum, int price, String owner) {
            this.width = width;
            this.height = height;
            this.carNum = carNum;
            this.price = price;
            this.owner = owner;
        }

        public void clark() {
            System.out.println("bbaaaang~");
        }
    }

    ArrayList<Sedan> sedans = new ArrayList<>();
    ArrayList<Truck> trucks = new ArrayList<>();
    ArrayList<Jeep> jeeps = new ArrayList<>();

    // 새로운 차가 주차장에 들어온다.
    void addCar(String type, String owner, int width, int height, int carNum, int price) {
        if (type.equals("Sedan")) {
            sedans.add(new Sedan(width, height, carNum, price, owner));
        } else if (type.equals("Jeep")) {
            jeeps.add(new Jeep(width, height, carNum, price, owner));
        } else if (type.equals("Truck")) {
            trucks.add(new Truck(width, height, carNum, price, owner));
        }
    }

    // 차량 번호를 기준으로 차량을 주차장에서 제거한다.
    void deleteCar(String type, int carNum) {
        if (type.equals("Sedan")) {
            for (int i=0; i<sedans.size(); i++) {
                if (sedans.get(i).carNum == carNum) {
                    sedans.remove(sedans.get(i));
                }
            }
        } else if (type.equals("Jeep")) {
            for (int i=0; i<jeeps.size(); i++) {
                if (jeeps.get(i).carNum == carNum) {
                    jeeps.remove(jeeps.get(i));
                }
            }
        } else if (type.equals("Truck")) {
            for (int i=0; i<trucks.size(); i++) {
                if (trucks.get(i).carNum == carNum) {
                    trucks.remove(trucks.get(i));
                }
            }
        }
    }

    // 주차된 차량 정보를 조회
    // type == 0 : 모든 차량 조회
    // type -- 1 : 세단 조회
    // type -- 2 : 지프 조회
    // type -- 3 : 트럭 조회
    void showParkedCar(int type) {
        if (type == 0) {
            for (int i=0; i<sedans.size(); i++) {
                System.out.println(String.format("Sedan %d : car no %d", i+1, sedans.get(i).carNum));
            }

            for (int i=0; i<jeeps.size(); i++) {
                System.out.println(String.format("Sedan %d : car no %d", i+1, jeeps.get(i).carNum));
            }

            for (int i=0; i<trucks.size(); i++) {
                System.out.println(String.format("Sedan %d : car no %d", i+1, trucks.get(i).carNum));
            }
        } else if (type == 1) {
            for (int i=0; i<sedans.size(); i++) {
                System.out.println(String.format("Sedan %d : car no %d", i+1, sedans.get(i).carNum));
            }
        } else if (type == 2) {
            for (int i=0; i<jeeps.size(); i++) {
                System.out.println(String.format("Sedan %d : car no %d", i+1, jeeps.get(i).carNum));
            }
        } else if (type == 3) {
            for (int i=0; i<trucks.size(); i++) {
                System.out.println(String.format("Sedan %d : car no %d", i+1, trucks.get(i).carNum));
            }
        }
    }

    // 프로그램 시작점
    public void start() {
        // Processing program...
    }
}
