package com.rocketseat.planner.participant;

import com.rocketseat.planner.trip.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParticipantService {



    public void registerParticipantToEvent(List<String> participantsToInvite, UUID tripId) {

    }

    public void triggerConfirmationEmailToParticipant(UUID tripId) {}
}
