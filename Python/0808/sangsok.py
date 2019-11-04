class Car:
    speed = 0

    def upSpeed(self, value):
        self.speed +=value

    def downSpeed(self, value):
        self.speed -=value

class Sedan(Car):
    seatNum=0
    
    def upSpeed(self, value):
        self.speed +=value

        if self.speed>150:
            self.speed=150
    
    def getSeatNum(self):
        return self.seatNum

class Truck(Car):
    capacity=0

    def getCapacity(self):
        return self.capacity

sedan1=Sedan()
truck1=Truck()

sedan1.upSpeed(200)
truck1.upSpeed(200)

sedan1.seatNum=5
truck1.capacity=50

print("승용차의 속도는 %d Km, 좌석수는 %d 개입니다. "
        %(sedan1.speed,sedan1.getSeatNum()))
print("트럭의 속도는 %d Km, 총 중량은 %d 톤입니다. "
        %(truck1.speed,truck1.getCapacity()))