Scenario: 
Given mock org.wmaop.pub.getParty returning data/parties.xmlcatlin.event.V01.pub:handleTechnicalEventExceptions always returning data/EmptyPipeline_output.xml
When invoke org.wmaop.pub.partyService:getLastestPartyIds with data/masterParty/getLatestPublishedMasterPartyIds_input1.xml
Then pipeline has size(partyIDs) == 3
And pipeline has arrays:contains(partyIDs, "M0525")
And pipeline has arrays:contains(partyIDs, "M7175")
And pipeline has arrays:contains(partyIDs, "M7176")