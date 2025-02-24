import matplotlib.pyplot as plt

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f'Linea de {self.p1} a {self.p2}'

    def dibujaLinea(self):
        print(f"Dibujando línea desde {self.p1} hasta {self.p2}")  # Depuración
        plt.figure(figsize=(5, 5))
        plt.plot([self.p1[0], self.p2[0]], [self.p1[1], self.p2[1]], 'ro-', label="Línea")
        plt.xlim(min(self.p1[0], self.p2[0]) - 1, max(self.p1[0], self.p2[0]) + 1)
        plt.ylim(min(self.p1[1], self.p2[1]) - 1, max(self.p1[1], self.p2[1]) + 1)
        plt.xlabel("X")
        plt.ylabel("Y")
        plt.grid(True)
        plt.legend()
        plt.show(block=True)  # Asegura que la ventana del gráfico no se cierre de inmediato



