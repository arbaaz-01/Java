package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.Entity.JournalEntity;
import net.engineeringdigest.journalApp.JournalApplication;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntry {

    Map<Long, JournalEntity> journalEntries = new HashMap<>();

    @GetMapping("/getRandomJournal")
    public JournalEntity getRandom(){
        Random random = new Random();
        Set<Long> set = journalEntries.keySet();
        List<Long> list = new ArrayList<>(set);
        if(list.isEmpty()) return new JournalEntity();
        return journalEntries.get(random.nextInt(list.size()));
    }

    @GetMapping("/getAllJournals")
    public List<JournalEntity> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

    @PostMapping("/addNewJournal")
    public boolean createEntry(@RequestBody JournalEntity journalEntity){
        journalEntries.put(journalEntity.getId(), journalEntity);
        return true;
    }

    @GetMapping("/id/{myId}")
    public JournalEntity getById(@PathVariable Long myId){
        if(!journalEntries.containsKey(myId)) return null;
        return journalEntries.get(myId);
    }

//    update an entry
    @PutMapping("/updateJournal/{id}")
    public JournalEntity updateJournalById(@PathVariable Long id, @RequestBody JournalEntity journalEntity){
            return journalEntries.put(id, journalEntity);
    }

//    delete an entry
    @DeleteMapping("/deleteJournal/{id}")
    public boolean deleteJournalById(@PathVariable Long id){
        if(!journalEntries.containsKey(id)) return false;
        journalEntries.remove(id);
        return true;

    }
}
