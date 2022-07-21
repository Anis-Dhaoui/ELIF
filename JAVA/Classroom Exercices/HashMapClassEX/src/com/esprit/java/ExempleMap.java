/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author aissa
 */
public class ExempleMap {
    
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        
        map.put("A", "Bonjour");
        map.put("B", "Bonjour");
        map.put("C", "Coucou");
        map.put("D", "Hello world !");
        System.out.println(map);
        map.put("A", "Bonsoir");
        System.out.println(map);
        System.out.println(map.get("B"));
        map.replace("A", "Hello");
        System.out.println(map);
        map.remove("B");
        System.out.println(map);
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue("Hello"));
        /*Set<String> keys = map.keySet();
        for(String ele : keys) {
            System.out.println(ele + "=" + map.get(ele));
        }*/
        for(String ele : map.keySet()) {
            System.out.println(ele + "=" + map.get(ele));
        }
        System.out.println("***********");
        /*Collection<String> values = map.values();
        for(String ele : values) {
            System.out.println(ele);
        }*/
        for(String ele : map.values()) {
            System.out.println(ele);
        }
        /*Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> ele : entries) {
            System.out.println(ele.getKey() + "=" + ele.getValue());
        }*/
        System.out.println("****************************************");
        for(Map.Entry<String, String> ele : map.entrySet()) {
            System.out.println(ele.getKey() + "=" + ele.getValue());
        }
    }
}
