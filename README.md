# LifeCycle Of Activity
onCreate()                                                                          
onStart()           
onResume()                                          
onPause()                   
onStop()                                                                            
onDestroy()

#### Activity A  navigates to Activity B
Activity A onPause() 

Activity B onCreate()      
Activity B onStart()                                                                
Activity B onResume()

Activity A onStop()

#### When back btn presses (return to Activity A)
Activity B onPause()

Activity A onRestart(), 
Activity A onStart(), 
Activity A onResume()

Activity B onStop(), 
Activity B onDestroy()

#LifeCycle of Fragment
onAttach()<br>
onCreate()<br>
onCreateView()<br>
onActivityCreated()<br>
onPause()<br>
onStop()<br>
onDestroyView()<br>
onDestroy()<br>
onDetach()<br>

#### When Activity B replace Fragment A by Fragment B without stack
Fragment A onPause()<br>    
Fragment B onAttach()<br>
Fragment B onCreate()<br>

Fragment A onStop()<br>
Fragment A onDestroyView()<br>
Fragment A onDestroy()<br>
Fragment A onDetach()<br>

Fragment B onCreateView()<br>
Fragment B onActivityCreated()<br>
Fragment B onStart()<br>
Fragment B onResume()<br>

### When back btn presses from Fragment B

Fragment B onPause()<br>
Activity B onPause()<br>

Activity A onRestart()<br>
Activity A onStart()<br>
Activity A onResume()<br>

Fragment B onStop()<br>
Frgament B onDestroyView()<br>
Frgament B onDestroy()<br>
Fragment B onDetach()<br>

Activity B onStop()<br>
Activity B onDestroy() <br>

### When Activity B replace Fragment A by Fragment B with stack
Fragment A onPause()<br>    
Fragment B onAttach()<br>
Fragment B onCreate()<br>

Fragment A onStop()<br>
Fragment A onDestroyView()<br>

Fragment B onCreateView()<br>
Fragment B onActivityCreated()<br>
Fragment B onStart()<br>
Fragment B onResume()<br>

### When back btn presses from Fragment B

Fragment B onPause()<br>
Fragment B onStop()<br>
Frgament B onDestroyView()<br>
Frgament B onDestroy()<br>
Fragment B onDetach()<br>

Fragment A onCreateView()<br>
Fragment A onActivityCreated()<br>
Fragment A onStart()<br>
Fragment A onResume()<br>




