<template>
  <div class="list row">
    <div class="col-md8">
      <div class="input-group mb-3">
        <input
          type="text"
          class="form-control"
          placeholder="Search by title"
          v-model="title"
        />
        <div class="input-group-append">
          <button
            class="btn btn-outline-secondary"
            type="button"
            @click="searchtitle"
          >
            Search
          </button>
        </div>
      </div>
    </div>
    <div class="col-md-6">
      <h4>Tutorials List</h4>
      <ul class="list-group">
        <li
          class="list-group-item"
          :class="{ active: index === currentIndex }"
          v-for="(tutorial, index) in tutorials"
          :key="index"
          @click="setActivetutorial(tutorial, index)"
        >
          {{tutorial.title}}
        </li>
      </ul>

      <button class="m-3 btn btn-sm btn-danger" @click="removeAlltutorials">
        Remove All
      </button>
    </div>

    <div class="col-md-6">
      <div v-if="currentTutorial">
        <h4>Tutorial</h4>
        <div>
          <label><strong>Title:</strong></label> {{ currentTutorial.title }}
        </div>
        <div>
          <label><strong>Description:</strong></label> {{ currentTutorial.description }}
        </div>
        <div>
          <label><strong>Status:</strong></label> {{ currentTutorial.published ? "Published" : "Pending" }}
        </div>

        <a
          :href="'/tutorials/' + currentTutorial.id"
          class="badge badge-warning">
          Edit
        </a>
      </div>
      <div v-else>
        <p>Please select a tutorial.</p>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import TutorialDataService from '../services/TutorialDataService';

@Component
export default class TutorialsList extends Vue {
  private tutorials: any[] = [];
  private currentTutorial: any = null;
  private currentIndex: number = -1;
  private title: string = "";
  
}

</script>