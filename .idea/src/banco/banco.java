package banco;
import java.text.DecimalFormat;
import java.sql.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.*;

public class banco {
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String dni, consulta, nombre, apellidos, cuenta;
double saldo = 0, importe= 0, importe_total = 0;
LocalDateTime fecha;
Date dia;
Time hora;
Connection connection;
Statement st;
ResultSet rs;
