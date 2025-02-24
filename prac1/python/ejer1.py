import math
class Punto:
    def __init__(self, x, y):
        self.abscisas=x
        self.ordenadas=y
    def coor_cartesianos(self):
        return (self.abscisas,self.ordenadas)
    def coor_polares(self):
        l=math.sqrt(self.abscisas**2+self.ordenadas**2)
        theta = math.degrees(math.atan2(self.ordenadas,self.abscisas))
        return (l, theta)

    def __str__(self):
        return f"Punto(x={self.abscisas}, y={self.ordenadas})"
a = Punto(3, 4)
print(a)  # Muestra: Punto(x=3, y=4)
print("Coordenadas Cartesianas:", a.coor_cartesianos())  # (3, 4)
print("Coordenadas Polares:", a.coor_polares())  # (5.0, 53.13...)
