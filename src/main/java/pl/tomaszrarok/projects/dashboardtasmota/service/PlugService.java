package pl.tomaszrarok.projects.dashboardtasmota.service;

import org.springframework.stereotype.Service;
import pl.tomaszrarok.projects.dashboardtasmota.model.Plug;
import pl.tomaszrarok.projects.dashboardtasmota.model.PlugStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlugService {

    Map<String, Plug> plugs = new HashMap<>();

    public PlugService(){
        init();
    }

    private void init(){
        plugs.put("plug 1", new Plug("",10.0, PlugStatus.ENABLED));
        plugs.put("plug 2", new Plug("",20.0, PlugStatus.ENABLED));
        plugs.put("plug 3", new Plug("",0.0, PlugStatus.DISABLED));
        plugs.put("plug 4", new Plug("",25.0, PlugStatus.ENABLED));
    }

    public List<Plug> getPlugs(){
        return new ArrayList<>(plugs.values());
    };

    public Plug toggle(String name){
        plugs.get(name).toggle();
        return plugs.get(name);
    }
}
