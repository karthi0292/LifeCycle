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

Activity A onRestart()

Activity A onStart()

Activity A onResume()

Activity B onStop()

Activity B onDestroy()
