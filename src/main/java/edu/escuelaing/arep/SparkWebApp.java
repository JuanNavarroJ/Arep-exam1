/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep;

import edu.escuealing.arep.calculadora.Calculadora;
import edu.escuelaing.arep.linkedList.LinkedList;
import edu.escuelaing.arep.linkedList.Nodo;
import spark.Request;
import spark.Response;
import static spark.Spark.*;
import org.json.simple.JSONObject;

/**
 * Clase SparWebApp que crea una web desarrollada con SPARK.
 *
 * @author Juan David
 */
public class SparkWebApp {

    // Atributos
    private static Calculadora calculadora;
    private static LinkedList linkedList;
    private Nodo nodo;

    /**
     * This main method uses SparkWeb static methods and lambda functions to
     * create a simple Hello World web app. It maps the lambda function to the
     * /hello relative URL.
     */
    public static void main(String[] args) {
        calculadora = new Calculadora();
        linkedList = new LinkedList();
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    /**
     * Metodo que crea el html de la pagina web.
     *
     * @param req Es el request de Spark
     * @param res Es el response de Spark
     * @return Retorna Un html en forma de string.
     */
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<style>"
                + "input[type=text], select { "
                + "width: 100%;"
                + "padding: 12px 20px;"
                + "margin: 8px 0;"
                + "display: inline-block;"
                + "border: 1px solid #ccc;"
                + "border-radius: 4px;"
                + "box-sizing: border-box;"
                + "}"
                + "input[type=submit] { "
                + "    width: 100%;"
                + "    background-color: #4CAF50;"
                + "    color: white; "
                + "    padding: 14px 20px;"
                + "    margin: 8px 0;"
                + "    border: none;"
                + "    border-radius: 4px;"
                + "    cursor: pointer;"
                + "}"
                + "input[type=submit]:hover {"
                + "background-color: #45a049;"
                + "}"
                + "div {"
                + "border-radius: 5px;"
                + "background-color: #f2f2f2;"
                + "padding: 20px;"
                + "}"
                + "</style>"
                + "<body>"
                + "<h2>Merge Sort y Sumatoria</h2>"
                + "<form action=\"/results\">"
                + "  Digite los numeros separados por comas.<br>"
                + "  <input type=\"text\" name='numeros'>"
                + "  <br>"
                + "  <input type=\"submit\" value=\"Ordenar los numeros ingresados de mayor a menor y obtener su sumatoria.\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    /**
     * Metodo que retorna un html con la respuesta.
     *
     * @param req Es el request de Spark
     * @param res Es el response de Spark
     * @return Retorna un String con el html el cual contiene la respuesta de la
     * media y demas datos.
     */
    private static JSONObject resultsPage(Request req, Response res) {
        JSONObject obj = new JSONObject();

        obj.put("name", "foo");
        obj.put("num", new Integer(100));
        obj.put("balance", new Double(1000.21));
        obj.put("is_vip", new Boolean(true));

        System.out.print(obj);
        linkedList.clear();
        /**
         * double num; String ans; String[] values =
         * req.queryParams("numeros").split(","); for (String i : values) { num
         * = Double.parseDouble(i); Nodo nodo = new Nodo(num, 0, null, null);
         * linkedList.add(nodo); }
         *
         *
         *
         * ans = "<!DOCTYPE html>" + "<html>" + "<body>" + "<h2>" + "La Media de
         * la lista de datos es: " + calculadora.calcularMedia(linkedList) +
         * "<h2>" + "<h2>" + "La Desviacion Estandar de la lista de datos es: "
         * + calculadora.calcularDesviacionEstandar(linkedList) + "<h2>" +
         * "<form>" +
         * "<input type=\"button\" value=\"Volver a modificar los datos!\" onclick=\"history.back()\">"
         * + "</form>" + "</body>" + "</html>";
        *
         */
        return obj;
    }

    /**
     * This method reads the default port as specified by the PORT variable in
     * the environment.
     *
     * Heroku provides the port automatically so you need this to run the
     * project on Heroku.
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
