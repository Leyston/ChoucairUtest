package co.com.choucair.certification.utestuser.model;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;
import java.util.Map;

public class DataTableConfigurator implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry){
        TableEntryTransformer<UtestUserData> transformer = new TableEntryTransformer<UtestUserData>() {
            @Override
            public UtestUserData transform(Map<String, String> entry) throws Throwable {
                return new UtestUserData(entry.get("srtFirstName"), entry.get("srtLastName"), entry.get("srtEmail")
                        , entry.get("srtMonthOfBirth"), entry.get("srtDayOfBirth"), entry.get("srtYearOfBirth"), entry.get("srtPassword"));
            }

        };
        DataTableType tableType = new DataTableType(UtestUserData.class, transformer);
        typeRegistry.defineDataTableType(tableType);
    }



}
