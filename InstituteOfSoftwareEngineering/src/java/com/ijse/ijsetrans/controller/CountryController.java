/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.ijsetrans.controller;

import com.google.gson.Gson;
import com.ijse.ijsetrans.core.Country;
import com.ijse.ijsetrans.service.CountryService;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Sanu
 */
@Controller
public class CountryController {

    @Autowired
    private CountryService cuCountryService;

    @RequestMapping("/addCountry")
    public void addCountry(HttpServletRequest req, HttpServletResponse resp) {
        try {
            String countries = "Afghanistan,Albania,Algeria,Andorra,Angola,Anguilla,Antigua & Barbuda,Argentina,Armenia,Australia,Austria,Azerbaijan,Bahamas,Bahrain,Bangladesh,Barbados,Belarus,Belgium,Belize,Benin,Bermuda,Bhutan,Bolivia,Bosnia & Herzegovina,Botswana,Brazil,Brunei Darussalam,Bulgaria,Burkina Faso,Myanmar/Burma,Burundi,Cambodia,Cameroon,Canada,Cape Verde,Cayman Islands,Central African Republic,Chad,Chile,China,Colombia,Comoros,Congo,Costa Rica,Croatia,Cuba,Cyprus,Czech Republic,Democratic Republic of the Congo,Denmark,Djibouti,Dominican Republic,Dominica,Ecuador,Egypt,El Salvador,Equatorial Guinea,Eritrea,Estonia,Ethiopia,Fiji,Finland,France,French Guiana,Gabon,Gambia,Georgia,Germany,Ghana,Great Britain,Greece,Grenada,Guadeloupe,Guatemala,Guinea,Guinea-Bissau,Guyana,Haiti,Honduras,Hungary,Iceland,India,Indonesia,Iran,Iraq,Israel and the Occupied Territories,Italy,Ivory Coast (Cote d'Ivoire),Jamaica,Japan,Jordan,Kazakhstan,Kenya,Kosovo,Kuwait,Kyrgyz Republic (Kyrgyzstan),Laos,Latvia,Lebanon,Lesotho,Liberia,Libya,Liechtenstein,Lithuania,Luxembourg,Republic of Macedonia,Madagascar,Malawi,Malaysia,Maldives,Mali,Malta,Martinique,Mauritania,Mauritius,Mayotte,Mexico,Moldova, Republic of,Monaco,Mongolia,Montenegro,Montserrat,Morocco,Mozambique,Namibia,Nepal,Netherlands,New Zealand,Nicaragua,Niger,Nigeria,Korea, Democratic Republic of (North Korea),Norway,Oman,Pacific Islands,Pakistan,Panama,Papua New Guinea,Paraguay,Peru,Philippines,Poland,Portugal,Puerto Rico,Qatar,Reunion,Romania,Russian Federation,Rwanda,Saint Kitts and Nevis,Saint Lucia,Saint Vincent's & Grenadines,Samoa,Sao Tome and Principe,Saudi Arabia,Senegal,Serbia,Seychelles,Sierra Leone,Singapore,Slovak Republic (Slovakia),Slovenia,Solomon Islands,Somalia,South Africa,Korea, Republic of (South Korea),South Sudan,Spain,Sri Lanka,Sudan,Suriname,Swaziland,Sweden,Switzerland,Syria,Tajikistan,Tanzania,Thailand,Timor Leste,Togo,Trinidad & Tobago,Tunisia,Turkey,Turkmenistan,Turks & Caicos Islands,Uganda,Ukraine,United Arab Emirates,United States of America (USA),Uruguay,Uzbekistan,Venezuela,Vietnam,Virgin Islands (UK),Virgin Islands (US),Yemen,Zambia,Zimbabwe";
            String[] split = countries.split(",");
            List<Country> allCountryList = cuCountryService.getAllCountryList();
            if (allCountryList.isEmpty()) {
                for (String string : split) {
                    try {
                        Country temp = new Country();
                        temp.setCountryname(string);
                        cuCountryService.addCountry(temp);
                    } catch (Exception ex) {
                        Logger.getLogger(CountryController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(CountryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @RequestMapping("/seoContry")
    public void getAllCountry(HttpServletRequest req, HttpServletResponse resp) {
        try {
            resp.setContentType("application/json");
            String sql = "from Country p where p.countryname='Sri Lanka'";
            List<Country> allCountryList = cuCountryService.getListForQuery(sql);
            if (!allCountryList.isEmpty()) {
                Country temp = new Country();
                for (Country country : allCountryList) {
                    temp.setCountryCode(country.getCountryCode());
                    temp.setCountryname(country.getCountryname());
                    temp.setId(country.getId());
                }
                String toJson = new Gson().toJson(temp);
                resp.getWriter().write(toJson);
            }

        } catch (Exception ex) {
            Logger.getLogger(CountryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
