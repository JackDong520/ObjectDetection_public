/**
 * Copyright 2019 bejson.com
 */
package temptable;

import Dao.HttpEmailDao;
import Dao.HttpEmailDataDao;
import Dao.HttpEmailSourceDao;
import com.google.gson.Gson;
import temptable.javabean.email.Data;
import temptable.javabean.email.Meta;

import org.testng.annotations.Test;
import temptable.temp.HttpEmailEntity;
import temptable.temp.HttpEmaildataEntity;
import temptable.temp.HttpEmailsourceEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Auto-generated: 2019-07-07 19:27:41
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class EmailInfo {

    private Data data;
    private Meta meta;

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }



    @Test
    public void test() {
        HttpEmailDataDao httpEmailDataDao = new HttpEmailDataDao();
        HttpEmailDao httpEmailDao =new HttpEmailDao();
        HttpEmailSourceDao httpEmailSourceDao =new HttpEmailSourceDao();
        String jsonstring = new String("{\n" +
                "  \"data\": {\n" +
                "    \"domain\": \"stripe.com\",\n" +
                "    \"disposable\": false,\n" +
                "    \"webmail\": false,\n" +
                "    \"pattern\": \"{first}.{last}\",\n" +
                "    \"organization\": \"Stripe\",\n" +
                "    \"emails\": [\n" +
                "      {\n" +
                "        \"value\": \"max.lahey@stripe.com\",\n" +
                "        \"type\": \"personal\",\n" +
                "        \"confidence\": 99,\n" +
                "        \"sources\": [\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/de-us/blog/unifying-payment-types-in-the-api\",\n" +
                "            \"extracted_on\": \"2019-06-01\",\n" +
                "            \"last_seen_on\": \"2019-06-01\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/en-es/blog/unifying-payment-types-in-the-api\",\n" +
                "            \"extracted_on\": \"2019-06-01\",\n" +
                "            \"last_seen_on\": \"2019-06-01\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/fr/blog/unifying-payment-types-in-the-api\",\n" +
                "            \"extracted_on\": \"2019-05-03\",\n" +
                "            \"last_seen_on\": \"2019-05-19\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/page/12\",\n" +
                "            \"extracted_on\": \"2019-05-01\",\n" +
                "            \"last_seen_on\": \"2019-05-22\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/12\",\n" +
                "            \"extracted_on\": \"2019-05-01\",\n" +
                "            \"last_seen_on\": \"2019-05-26\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/unifying-payment-types-in-the-api\",\n" +
                "            \"extracted_on\": \"2018-08-18\",\n" +
                "            \"last_seen_on\": \"2019-05-20\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/11\",\n" +
                "            \"extracted_on\": \"2019-02-21\",\n" +
                "            \"last_seen_on\": \"2019-02-24\",\n" +
                "            \"still_on_page\": false\n" +
                "          }\n" +
                "        ],\n" +
                "        \"first_name\": \"Max\",\n" +
                "        \"last_name\": \"Lahey\",\n" +
                "        \"position\": null,\n" +
                "        \"seniority\": null,\n" +
                "        \"department\": null,\n" +
                "        \"linkedin\": null,\n" +
                "        \"twitter\": null,\n" +
                "        \"phone_number\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"value\": \"mary@stripe.com\",\n" +
                "        \"type\": \"personal\",\n" +
                "        \"confidence\": 99,\n" +
                "        \"sources\": [\n" +
                "          {\n" +
                "            \"domain\": \"advogato.p2b.tv\",\n" +
                "            \"uri\": \"http://advogato.p2b.tv/person/hypatia\",\n" +
                "            \"extracted_on\": \"2018-08-10\",\n" +
                "            \"last_seen_on\": \"2018-08-10\",\n" +
                "            \"still_on_page\": false\n" +
                "          }\n" +
                "        ],\n" +
                "        \"first_name\": \"Mary\",\n" +
                "        \"last_name\": \"Gardiner\",\n" +
                "        \"position\": null,\n" +
                "        \"seniority\": null,\n" +
                "        \"department\": null,\n" +
                "        \"linkedin\": null,\n" +
                "        \"twitter\": null,\n" +
                "        \"phone_number\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"value\": \"hamish.kerr@stripe.com\",\n" +
                "        \"type\": \"personal\",\n" +
                "        \"confidence\": 99,\n" +
                "        \"sources\": [\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/ie/blog/connect-dashboard-updates-june-2018\",\n" +
                "            \"extracted_on\": \"2019-06-08\",\n" +
                "            \"last_seen_on\": \"2019-06-08\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/fr/blog/connect-dashboard-updates-june-2018\",\n" +
                "            \"extracted_on\": \"2019-05-04\",\n" +
                "            \"last_seen_on\": \"2019-06-17\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/page/3\",\n" +
                "            \"extracted_on\": \"2019-05-03\",\n" +
                "            \"last_seen_on\": \"2019-05-21\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/3\",\n" +
                "            \"extracted_on\": \"2019-05-03\",\n" +
                "            \"last_seen_on\": \"2019-05-25\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/2\",\n" +
                "            \"extracted_on\": \"2019-01-23\",\n" +
                "            \"last_seen_on\": \"2019-05-02\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/connect-dashboard-updates-june-2018\",\n" +
                "            \"extracted_on\": \"2018-12-05\",\n" +
                "            \"last_seen_on\": \"2019-05-20\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/page/2\",\n" +
                "            \"extracted_on\": \"2018-11-20\",\n" +
                "            \"last_seen_on\": \"2019-05-01\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog\",\n" +
                "            \"extracted_on\": \"2018-07-31\",\n" +
                "            \"last_seen_on\": \"2018-09-17\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/1\",\n" +
                "            \"extracted_on\": \"2018-06-21\",\n" +
                "            \"last_seen_on\": \"2018-09-21\",\n" +
                "            \"still_on_page\": false\n" +
                "          }\n" +
                "        ],\n" +
                "        \"first_name\": \"Hamish\",\n" +
                "        \"last_name\": \"Kerr\",\n" +
                "        \"position\": \"Resource Management\",\n" +
                "        \"seniority\": null,\n" +
                "        \"department\": null,\n" +
                "        \"linkedin\": null,\n" +
                "        \"twitter\": \"hamish_kerr\",\n" +
                "        \"phone_number\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"value\": \"jorge.ortiz@stripe.com\",\n" +
                "        \"type\": \"personal\",\n" +
                "        \"confidence\": 99,\n" +
                "        \"sources\": [\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/es-us/blog/connect-updates\",\n" +
                "            \"extracted_on\": \"2019-06-09\",\n" +
                "            \"last_seen_on\": \"2019-06-09\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/en-at/blog/connect-updates\",\n" +
                "            \"extracted_on\": \"2019-06-01\",\n" +
                "            \"last_seen_on\": \"2019-06-01\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/en-ch/blog/connect-updates\",\n" +
                "            \"extracted_on\": \"2019-06-01\",\n" +
                "            \"last_seen_on\": \"2019-06-01\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/fr/blog/connect-updates\",\n" +
                "            \"extracted_on\": \"2019-05-11\",\n" +
                "            \"last_seen_on\": \"2019-06-01\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/6\",\n" +
                "            \"extracted_on\": \"2019-02-11\",\n" +
                "            \"last_seen_on\": \"2019-05-23\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/page/6\",\n" +
                "            \"extracted_on\": \"2019-01-30\",\n" +
                "            \"last_seen_on\": \"2019-05-19\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/4\",\n" +
                "            \"extracted_on\": \"2018-02-21\",\n" +
                "            \"last_seen_on\": \"2018-07-17\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/3\",\n" +
                "            \"extracted_on\": \"2018-01-15\",\n" +
                "            \"last_seen_on\": \"2018-02-08\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/2\",\n" +
                "            \"extracted_on\": \"2017-08-19\",\n" +
                "            \"last_seen_on\": \"2017-11-21\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/1\",\n" +
                "            \"extracted_on\": \"2017-05-30\",\n" +
                "            \"last_seen_on\": \"2017-08-15\",\n" +
                "            \"still_on_page\": false\n" +
                "          }\n" +
                "        ],\n" +
                "        \"first_name\": \"Jorge\",\n" +
                "        \"last_name\": \"Ortiz\",\n" +
                "        \"position\": null,\n" +
                "        \"seniority\": null,\n" +
                "        \"department\": null,\n" +
                "        \"linkedin\": null,\n" +
                "        \"twitter\": \"jorgeo\",\n" +
                "        \"phone_number\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"value\": \"larry@stripe.com\",\n" +
                "        \"type\": \"personal\",\n" +
                "        \"confidence\": 99,\n" +
                "        \"sources\": [\n" +
                "          {\n" +
                "            \"domain\": \"larryullman.com\",\n" +
                "            \"uri\": \"http://larryullman.com/2013/07/29/what-is-larry-thinking-71-on-joining-stripe\",\n" +
                "            \"extracted_on\": \"2016-10-26\",\n" +
                "            \"last_seen_on\": \"2019-04-11\",\n" +
                "            \"still_on_page\": true\n" +
                "          }\n" +
                "        ],\n" +
                "        \"first_name\": \"Larry\",\n" +
                "        \"last_name\": \"Ullman\",\n" +
                "        \"position\": null,\n" +
                "        \"seniority\": null,\n" +
                "        \"department\": null,\n" +
                "        \"linkedin\": \"http://www.linkedin.com/pub/larry-ullman/0/354/a32\",\n" +
                "        \"twitter\": \"larryullman\",\n" +
                "        \"phone_number\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"value\": \"daniel.heffernan@stripe.com\",\n" +
                "        \"type\": \"personal\",\n" +
                "        \"confidence\": 99,\n" +
                "        \"sources\": [\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/en-es/blog/stripe-in-japan\",\n" +
                "            \"extracted_on\": \"2019-06-14\",\n" +
                "            \"last_seen_on\": \"2019-06-14\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/en-ch/blog/stripe-in-japan\",\n" +
                "            \"extracted_on\": \"2019-06-01\",\n" +
                "            \"last_seen_on\": \"2019-06-01\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/page/9\",\n" +
                "            \"extracted_on\": \"2019-05-20\",\n" +
                "            \"last_seen_on\": \"2019-05-20\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/fr/blog/stripe-in-japan\",\n" +
                "            \"extracted_on\": \"2019-05-03\",\n" +
                "            \"last_seen_on\": \"2019-05-03\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/stripe-in-japan\",\n" +
                "            \"extracted_on\": \"2019-01-23\",\n" +
                "            \"last_seen_on\": \"2019-05-20\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"3rd-solution.com\",\n" +
                "            \"uri\": \"http://3rd-solution.com/2016/10/stripe-in-japan.html\",\n" +
                "            \"extracted_on\": \"2017-09-19\",\n" +
                "            \"last_seen_on\": \"2018-02-21\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/4\",\n" +
                "            \"extracted_on\": \"2017-07-18\",\n" +
                "            \"last_seen_on\": \"2017-10-23\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/3\",\n" +
                "            \"extracted_on\": \"2017-05-02\",\n" +
                "            \"last_seen_on\": \"2017-07-06\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/2\",\n" +
                "            \"extracted_on\": \"2017-02-28\",\n" +
                "            \"last_seen_on\": \"2017-04-01\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog\",\n" +
                "            \"extracted_on\": \"2016-10-05\",\n" +
                "            \"last_seen_on\": \"2016-12-07\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/1\",\n" +
                "            \"extracted_on\": \"2016-10-05\",\n" +
                "            \"last_seen_on\": \"2017-01-12\",\n" +
                "            \"still_on_page\": false\n" +
                "          }\n" +
                "        ],\n" +
                "        \"first_name\": \"Daniel\",\n" +
                "        \"last_name\": \"Heffernan\",\n" +
                "        \"position\": null,\n" +
                "        \"seniority\": null,\n" +
                "        \"department\": null,\n" +
                "        \"linkedin\": null,\n" +
                "        \"twitter\": \"danielshi\",\n" +
                "        \"phone_number\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"value\": \"rasmus.rygaard@stripe.com\",\n" +
                "        \"type\": \"personal\",\n" +
                "        \"confidence\": 99,\n" +
                "        \"sources\": [\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/en-ch/blog/native-support-for-taxes-and-shipping\",\n" +
                "            \"extracted_on\": \"2019-06-09\",\n" +
                "            \"last_seen_on\": \"2019-06-09\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/en-dk/blog/native-support-for-taxes-and-shipping\",\n" +
                "            \"extracted_on\": \"2019-06-01\",\n" +
                "            \"last_seen_on\": \"2019-06-01\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/fr/blog/native-support-for-taxes-and-shipping\",\n" +
                "            \"extracted_on\": \"2019-05-23\",\n" +
                "            \"last_seen_on\": \"2019-05-23\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/page/10\",\n" +
                "            \"extracted_on\": \"2019-05-11\",\n" +
                "            \"last_seen_on\": \"2019-05-22\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/native-support-for-taxes-and-shipping\",\n" +
                "            \"extracted_on\": \"2019-01-22\",\n" +
                "            \"last_seen_on\": \"2019-05-20\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/4\",\n" +
                "            \"extracted_on\": \"2017-05-02\",\n" +
                "            \"last_seen_on\": \"2017-07-24\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/3\",\n" +
                "            \"extracted_on\": \"2017-02-28\",\n" +
                "            \"last_seen_on\": \"2017-03-31\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/2\",\n" +
                "            \"extracted_on\": \"2016-11-22\",\n" +
                "            \"last_seen_on\": \"2016-12-28\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/1\",\n" +
                "            \"extracted_on\": \"2016-07-02\",\n" +
                "            \"last_seen_on\": \"2016-10-05\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog\",\n" +
                "            \"extracted_on\": \"2016-06-29\",\n" +
                "            \"last_seen_on\": \"2016-10-05\",\n" +
                "            \"still_on_page\": false\n" +
                "          }\n" +
                "        ],\n" +
                "        \"first_name\": \"Rasmus\",\n" +
                "        \"last_name\": \"Rygaard\",\n" +
                "        \"position\": null,\n" +
                "        \"seniority\": null,\n" +
                "        \"department\": null,\n" +
                "        \"linkedin\": null,\n" +
                "        \"twitter\": null,\n" +
                "        \"phone_number\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"value\": \"guillaume.princen@stripe.com\",\n" +
                "        \"type\": \"personal\",\n" +
                "        \"confidence\": 99,\n" +
                "        \"sources\": [\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/en-es/blog/stripe-en-france\",\n" +
                "            \"extracted_on\": \"2019-06-14\",\n" +
                "            \"last_seen_on\": \"2019-06-14\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/en-dk/blog/stripe-en-france\",\n" +
                "            \"extracted_on\": \"2019-06-01\",\n" +
                "            \"last_seen_on\": \"2019-06-01\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/page/10\",\n" +
                "            \"extracted_on\": \"2019-05-11\",\n" +
                "            \"last_seen_on\": \"2019-05-22\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/fr/blog/stripe-en-france\",\n" +
                "            \"extracted_on\": \"2019-05-09\",\n" +
                "            \"last_seen_on\": \"2019-06-09\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/stripe-en-france\",\n" +
                "            \"extracted_on\": \"2019-01-22\",\n" +
                "            \"last_seen_on\": \"2019-05-20\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/4\",\n" +
                "            \"extracted_on\": \"2017-05-02\",\n" +
                "            \"last_seen_on\": \"2017-07-12\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/3\",\n" +
                "            \"extracted_on\": \"2017-02-28\",\n" +
                "            \"last_seen_on\": \"2017-03-31\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/2\",\n" +
                "            \"extracted_on\": \"2016-10-05\",\n" +
                "            \"last_seen_on\": \"2016-12-28\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog\",\n" +
                "            \"extracted_on\": \"2016-06-29\",\n" +
                "            \"last_seen_on\": \"2016-07-02\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/1\",\n" +
                "            \"extracted_on\": \"2016-06-11\",\n" +
                "            \"last_seen_on\": \"2016-09-16\",\n" +
                "            \"still_on_page\": false\n" +
                "          }\n" +
                "        ],\n" +
                "        \"first_name\": \"Guillaume\",\n" +
                "        \"last_name\": \"Princen\",\n" +
                "        \"position\": null,\n" +
                "        \"seniority\": null,\n" +
                "        \"department\": null,\n" +
                "        \"linkedin\": null,\n" +
                "        \"twitter\": \"g_princen\",\n" +
                "        \"phone_number\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"value\": \"julia@stripe.com\",\n" +
                "        \"type\": \"personal\",\n" +
                "        \"confidence\": 99,\n" +
                "        \"sources\": [\n" +
                "          {\n" +
                "            \"domain\": \"geekfeminismdotorg.wordpress.com\",\n" +
                "            \"uri\": \"http://geekfeminismdotorg.wordpress.com/2015/04/01/gf-classifieds-april-may-and-june-2015\",\n" +
                "            \"extracted_on\": \"2019-03-06\",\n" +
                "            \"last_seen_on\": \"2019-06-20\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"pypi.org\",\n" +
                "            \"uri\": \"http://pypi.org/project/topmodel\",\n" +
                "            \"extracted_on\": \"2017-05-20\",\n" +
                "            \"last_seen_on\": \"2019-06-02\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"gitlab.tuobian.cn\",\n" +
                "            \"uri\": \"http://gitlab.tuobian.cn/tuobian/nbconvert/repository/stats\",\n" +
                "            \"extracted_on\": \"2016-02-09\",\n" +
                "            \"last_seen_on\": \"2018-09-04\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"geekfeminism.org\",\n" +
                "            \"uri\": \"http://geekfeminism.org/2015/04/01/gf-classifieds-april-may-and-june-2015\",\n" +
                "            \"extracted_on\": \"2016-01-25\",\n" +
                "            \"last_seen_on\": \"2019-01-07\",\n" +
                "            \"still_on_page\": false\n" +
                "          }\n" +
                "        ],\n" +
                "        \"first_name\": \"Julia\",\n" +
                "        \"last_name\": \"Evans\",\n" +
                "        \"position\": \"Software Engineering\",\n" +
                "        \"seniority\": null,\n" +
                "        \"department\": \"it\",\n" +
                "        \"linkedin\": null,\n" +
                "        \"twitter\": \"geekfeminism\",\n" +
                "        \"phone_number\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"value\": \"gabriel.hubert@stripe.com\",\n" +
                "        \"type\": \"personal\",\n" +
                "        \"confidence\": 99,\n" +
                "        \"sources\": [\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/de-us/blog/checkout-in-more-languages\",\n" +
                "            \"extracted_on\": \"2019-06-01\",\n" +
                "            \"last_seen_on\": \"2019-06-01\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/en-es/blog/checkout-in-more-languages\",\n" +
                "            \"extracted_on\": \"2019-06-01\",\n" +
                "            \"last_seen_on\": \"2019-06-01\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/11\",\n" +
                "            \"extracted_on\": \"2019-05-14\",\n" +
                "            \"last_seen_on\": \"2019-05-24\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/blog/page/11\",\n" +
                "            \"extracted_on\": \"2019-04-22\",\n" +
                "            \"last_seen_on\": \"2019-05-24\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/gb/blog/checkout-in-more-languages\",\n" +
                "            \"extracted_on\": \"2016-05-15\",\n" +
                "            \"last_seen_on\": \"2019-05-08\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"stripe.com\",\n" +
                "            \"uri\": \"http://stripe.com/fr/blog/checkout-in-more-languages\",\n" +
                "            \"extracted_on\": \"2016-04-05\",\n" +
                "            \"last_seen_on\": \"2019-06-01\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/checkout-in-more-languages\",\n" +
                "            \"extracted_on\": \"2015-12-12\",\n" +
                "            \"last_seen_on\": \"2019-04-27\",\n" +
                "            \"still_on_page\": true\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/3\",\n" +
                "            \"extracted_on\": \"2016-09-16\",\n" +
                "            \"last_seen_on\": \"2016-10-05\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog/page/2\",\n" +
                "            \"extracted_on\": \"2016-03-23\",\n" +
                "            \"last_seen_on\": \"2016-07-02\",\n" +
                "            \"still_on_page\": false\n" +
                "          },\n" +
                "          {\n" +
                "            \"domain\": \"uploads.stripe.com\",\n" +
                "            \"uri\": \"http://uploads.stripe.com/blog\",\n" +
                "            \"extracted_on\": \"2015-12-12\",\n" +
                "            \"last_seen_on\": \"2016-03-11\",\n" +
                "            \"still_on_page\": false\n" +
                "          }\n" +
                "        ],\n" +
                "        \"first_name\": \"Gabriel\",\n" +
                "        \"last_name\": \"Hubert\",\n" +
                "        \"position\": \"Regulatory Compliance\",\n" +
                "        \"seniority\": null,\n" +
                "        \"department\": null,\n" +
                "        \"linkedin\": null,\n" +
                "        \"twitter\": \"gabhubert\",\n" +
                "        \"phone_number\": null\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"meta\": {\n" +
                "    \"results\": 175,\n" +
                "    \"limit\": 10,\n" +
                "    \"offset\": 0,\n" +
                "    \"params\": {\n" +
                "      \"domain\": \"stripe.com\",\n" +
                "      \"company\": null,\n" +
                "      \"type\": null,\n" +
                "      \"seniority\": null,\n" +
                "      \"department\": null\n" +
                "    }\n" +
                "  }\n" +
                "}");
        Gson gson = new Gson();
        EmailInfo emailInfo = new EmailInfo();
        emailInfo = gson.fromJson(jsonstring, (Type) EmailInfo.class);
        //System.out.println(emailInfo.toString());

        ArrayList<HttpEmaildataEntity> datatables = new ArrayList<>();
        ArrayList<HttpEmailEntity> emailtables = new ArrayList<>();
        ArrayList<HttpEmailsourceEntity> emailsourcetalbes = new ArrayList<>();
        //HttpEmaildataEntity
        for(int i=0; i< emailInfo.getData().getEmails().size();i++){
            HttpEmaildataEntity data = new HttpEmaildataEntity();
            data.setDomain(emailInfo.getData().getDomain());
            data.setOrganization(emailInfo.getData().getOrganization());
            data.setEmails(emailInfo.getData().getEmails().get(i).getValue());
            datatables.add(data);//插入
            /**
             *
             */
            httpEmailDataDao.saveHttpEmailDataInfo(data);


            //HttpEmailEntity
            HttpEmailEntity emailtable = new HttpEmailEntity();
            emailtable.setValue(emailInfo.getData().getEmails().get(i).getValue());
            emailtable.setDepartment(emailInfo.getData().getEmails().get(i).getDepartment());

            emailtable.setFirstName(emailInfo.getData().getEmails().get(i).getFirst_name());
            emailtable.setLastName(emailInfo.getData().getEmails().get(i).getLast_name());
            emailtable.setLinkedin(emailInfo.getData().getEmails().get(i).getLinkedin());
            emailtable.setPhoneNumber(emailInfo.getData().getEmails().get(i).getPhone_number());
            emailtable.setPosition(emailInfo.getData().getEmails().get(i).getPosition());
            emailtable.setSeniority(emailInfo.getData().getEmails().get(i).getSeniority());
            emailtable.setTwitter(emailInfo.getData().getEmails().get(i).getTwitter());
            emailtable.setType(emailInfo.getData().getEmails().get(i).getType());
            emailtables.add(emailtable);//插入
            /**
             *
             */
            httpEmailDao.saveHttpEmailInfo(emailtable);

            //EmailSourceTable
            for(int j=0; j < emailInfo.getData().getEmails().get(i).getSources().size();j++){
                HttpEmailsourceEntity emailsourcetable = new HttpEmailsourceEntity();
                emailsourcetable.setEmail(emailInfo.getData().getEmails().get(i).getValue());
                emailsourcetable.setDomain(emailInfo.getData().getEmails().get(i).getSources().get(j).getDomain());
                emailsourcetable.setStillOnPage(emailInfo.getData().getEmails().get(i).getSources().get(j).getStill_on_page()?1:0);
                emailsourcetable.setUri(emailInfo.getData().getEmails().get(i).getSources().get(j).getUri());
                emailsourcetalbes.add(emailsourcetable);//插入
                /**
                 *
                 */
                httpEmailSourceDao.saveHttpEmailSourceInfo(emailsourcetable);
            }

        }


        System.out.printf("");

    }
}